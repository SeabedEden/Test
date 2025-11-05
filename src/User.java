public class User {
    protected String namaPengguna;
    protected String jabatan;

    public User(String namaPengguna, String jabatan) {
        this.namaPengguna = namaPengguna;
        this.jabatan = jabatan;
    }

    public void tampilkanData() {
        System.out.println("\nSelamat datang, " + namaPengguna + "!");
        System.out.println("Status akun: " + jabatan);
    }
}
