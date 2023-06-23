/*class parent */
class BangunDatar {
    /*Mendefinisikan kelas BangunDatar sebagai kelas induk (parent class). */
    private String name; /* Memiliki properti name yang dijadikan private.*/

    public BangunDatar(String name) {
        /*Memiliki constructor BangunDatar yang menerima satu argumen name dan menginisialisasi properti name dengan nilai argumen */
        this.name = name;
    }

    public String getName() {
        /*metode getName() untuk mengembalikan nilai properti name. */
        return name;
    }

    public void hitungLuas() {
        /*Memiliki metode hitungLuas() yang mencetak pesan sederhana "Menghitung luas [nama bangun datar]". */
        System.out.println("Menghitung luas " + name);
    }

    public void hitungKeliling() {
        /*Memiliki metode hitungKeliling() yang mencetak pesan sederhana "Menghitung keliling [nama bangun datar]". */
        System.out.println("Menghitung keliling " + name);
    }
}