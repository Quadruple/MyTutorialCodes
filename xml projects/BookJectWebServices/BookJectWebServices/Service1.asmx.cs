using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Data.SqlClient;
using System.Data.OleDb;

namespace BookJectWebServices
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

        [WebMethod]
        public string RegisterUser(string email , string password , string username) { 
        
            //Designing queries for connections
            string connectionQuery = "Data Source=ATA\\SQLEXPRESS;Initial Catalog=BookJect;Integrated Security=true" ;
            string registerQuery = "INSERT INTO UserCredentials (email,password,username) VALUES ('"+ email +"' , '"+ password +"' , '"+ username +"')" ;

            //Connecting and inserting using queries in try catch
            try {

                SqlConnection conn = new SqlConnection(connectionQuery) ;
                SqlCommand command = new SqlCommand() ;
                command.Connection = conn ;
                conn.Open();
                command.CommandText = registerQuery;
                command.ExecuteNonQuery();
                conn.Close();
                return "Üyeliğiniz başarıyla kaydedildi.";
            
            }catch(Exception e) {

                return "Üyeliğiniz kaydedilirken bir sorun yaşandı. Lütfen yeniden deneyin.";
            
            }
        
        }

        [WebMethod]
        public string isEmailRegistered(string email) {

            string connectionQuery = "Data Source=ATA\\SQLEXPRESS;Initial Catalog=BookJect;Integrated Security=true";
            string checkingQuery = "SELECT * FROM UserCredentials WHERE (email = '"+ email +"')";

            SqlConnection conn = new SqlConnection(connectionQuery);
            conn.Open();
            SqlCommand cmd = new SqlCommand(checkingQuery , conn);
            cmd.Parameters.AddWithValue("email" , email);
            var result = cmd.ExecuteScalar();
            if(result != null) {

                conn.Close();
                return "Bu e-mail zaten üye.";
            
            }else{

                conn.Close();
                return "E-mailiniz üye olabilir.";
            
            }
        
        }

        [WebMethod]
        public string isUsernameRegistered(string username) {

            string connectionQuery = "Data Source=ATA\\SQLEXPRESS;Initial Catalog=BookJect;Integrated Security=true";
            string checkingQuery = "SELECT * FROM UserCredentials WHERE (username = '"+ username +"')";

            SqlConnection conn = new SqlConnection(connectionQuery);
            conn.Open();
            SqlCommand cmd = new SqlCommand(checkingQuery , conn);
            cmd.Parameters.AddWithValue("username" , username);
            var result = cmd.ExecuteScalar();
            if(result != null) {

                conn.Close();
                return "Bu kullanıcı adı zaten kayıtlı.";
            
            }else{

                conn.Close();
                return "Kullanıcı adı kullanılabilir.";
            
            }
        
        }

        [WebMethod]
        public string matchPasswordWithEmail(string email) {

            string connectionQuery = "Data Source=ATA\\SQLEXPRESS;Initial Catalog=BookJect;Integrated Security=true";
            string getPasswordQuery = "SELECT * FROM UserCredentials WHERE (email = '"+ email +"')";
            string passwordFromDatabase = "";

            using(SqlConnection conn = new SqlConnection(connectionQuery)){

                conn.Open();
                using(SqlCommand cmd = new SqlCommand(getPasswordQuery , conn)) {
                
                    using(SqlDataReader reader = cmd.ExecuteReader()) {

                        if (reader != null)
                        {
                            try
                            {
                                reader.Read();
                                passwordFromDatabase = reader["password"].ToString();
                            }catch(Exception e) {

                                passwordFromDatabase = "E-mail bulunamadı." ;
                            
                            }
                        }

                        reader.Close();
                        reader.Dispose();
                    }

                    cmd.Dispose();
                }

                conn.Close();
                conn.Dispose();
            }

            return passwordFromDatabase ;
        }
    }
}