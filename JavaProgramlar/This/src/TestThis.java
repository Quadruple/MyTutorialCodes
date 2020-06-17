class TestThis{
    private int x=1;
    
    public void setX(int x){
        System.out.println(this.x);
        System.out.println(x);
        x=this.x;
        System.out.println(x);
    }
   
}