public class main {
    public static String kata = ("\nUJIAN PBO 2IA22");
    public static void CetakKata(){
		System.out.println(kata);
	}



    public static void main(String[] args){
        //Encapsulation
        System.out.println("SELAMAT DATANG SILAHKAN LOGIN AKUN");
        login akun = new login();
        akun.setId("56419954");
        akun.setPw("aditya123");
        System.out.println("Username : " + akun.getId());
        System.out.println("Password : " + akun.getPw());
        System.out.println("Status : " + akun.cek());

        //Inheritance
		cetak m1 = new cetak();
        CetakKata();
		m1.CetakNama("Aditya Pramudita");
		m1.CetakNPM();

        //Polymorphism
        String emailPenerima = "Shootadit46@gmail.com";
        email cetakemail = new email();
        String isiPesan = "~SELAMAT UJIAN ADITYA~";
        cetakemail.pesan(emailPenerima, isiPesan);
	}

}
class login{
    //Encapsulation
    private String id, pw;
    public void setId(String id){
        this.id = id;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public String getId(){
        return this.id;
    }
    public String getPw(){
        return this.pw;
    }  
    public String cek(){
        if(this.id == "56419954" && this.pw == "aditya123"){
            return "Berhasil Login!";
        } else {
            return "Gagal Login!";
        }
    }
}


