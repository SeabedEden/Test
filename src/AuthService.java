public class AuthService {
    private String[][] data = {
            {"devin25", "12345", "Mahasiswa"},
            {"sifia25", "12345", "Mahasiswa"},
            {"sultan25", "12345", "Mahasiswa"},
            {"okto25", "12345", "Dosen"}
    };

    private String username, password, peran;

    public AuthService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private boolean verifikasiAkun() {
        for (String[] akun : data) {
            if (akun[0].equals(username) && akun[1].equals(password)) {
                peran = akun[2];
                return true;
            }
        }
        return false;
    }

    public void login() {
        if (verifikasiAkun()) {
            if (peran.equalsIgnoreCase("Mahasiswa")) {
                Mahasiswa m = new Mahasiswa(username);
                m.tampilkanData();
            } else {
                Dosen d = new Dosen(username);
                d.tampilkanData();
            }
        } else {
            System.out.println("\nLogin gagal! Username atau password salah.");
        }
    }
}
