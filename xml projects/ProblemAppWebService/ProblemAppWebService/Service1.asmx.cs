using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Data.SqlClient;
using System.Data.OleDb;

namespace ProblemAppWebService
{
    /// <summary>
    /// Summary description for Service1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class Service1 : System.Web.Services.WebService
    {

        public Service1() {}

        [WebMethod]
        public string insertIntoUserCredentials(string userEmail , string userPassword) {

            string connectionQuery = "Data Source=ATA\\SQLEXPRESS;Initial Catalog=ProblemAppDatabase;Integrated Security=true" ;
            string insertingQuery = "INSERT INTO KullaniciKimlikleri (kullaniciemail,sifre) VALUES ('"+userEmail+"','"+userPassword+"')" ; 

            try {

                SqlConnection conn = new SqlConnection(connectionQuery) ;
                SqlCommand command = new SqlCommand();
                command.Connection = conn ;
                conn.Open();
                command.CommandText = insertingQuery ;
                command.ExecuteNonQuery();
                conn.Close();
                return "Üyeliğiniz veritabanımıza kaydedildi. Merak etmeyin, anonimliğinizi koruyoruz." ; 
            
            }catch(Exception e) {

                return "Bilgileriniz kaydedilirken bir sorun yaşandı. Lütfen tekrar deneyin.";
            
            }

        }

        [WebMethod]
        public String ifEmailInDatabase(string userEmail)
        {

            string connectionQuery = "Data Source=ATA\\SQLEXPRESS;Initial Catalog=ProblemAppDatabase;Integrated Security=true";
            string checkingQuery = "SELECT * FROM KullaniciKimlikleri WHERE (kullaniciemail = '" + userEmail + "')";
           

            SqlConnection conn = new SqlConnection(connectionQuery);
            conn.Open();
            SqlCommand cmd = new SqlCommand(checkingQuery , conn);
            cmd.Parameters.AddWithValue("kullaniciemail" , userEmail);
            var result = cmd.ExecuteScalar();
            if (result != null)
            {
                conn.Close();
                return "Bu email zaten kayıtlı.";
            }
            else
            {
                conn.Close();
                return "Email önceden kayıtlı degil.";
            }

        }

        [WebMethod]
        public String checkPasswordWithEmail(String userEmail) {

            string connectionQuery = "Data Source=ATA\\SQLEXPRESS;Initial Catalog=ProblemAppDatabase;Integrated Security=true" ;
            string gettingQuery = "SELECT * FROM KullaniciKimlikleri WHERE (kullaniciemail = '" + userEmail + "')";
            string passwordFromDatabase = "" ;

            using (SqlConnection conn = new SqlConnection(connectionQuery)) {

                conn.Open();
                using(SqlCommand cmd = new SqlCommand(gettingQuery , conn)){
                
                    using(SqlDataReader reader = cmd.ExecuteReader()) {

                        if (reader != null)
                        {

                            reader.Read();
                            passwordFromDatabase = reader["sifre"].ToString();

                        }
                   
                        reader.Close();
                        reader.Dispose();
                    }
                    cmd.Dispose();
                }
                conn.Close();
                conn.Dispose();
            }

            return passwordFromDatabase;
        
        }
        
    }
}