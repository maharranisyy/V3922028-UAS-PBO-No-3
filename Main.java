/*class child */
class Persegi extends BangunDatar {
    /*Mendefinisikan kelas Persegi sebagai turunan dari BangunDatar (child class). */
    private double sisi;

    public Persegi(String name, double sisi) {
        /*Memiliki constructor Persegi yang menerima dua argumen name dan sisi,  */
        super(name);
        this.sisi = sisi;
    }

    public double getSisi() {
        /*Memiliki metode getSisi() yang mengembalikan nilai properti sisi. */
        return sisi;
    }

    @Override
    public void hitungLuas() {
        /*Meng-override metode hitungLuas() untuk menghitung luas persegi dengan rumus sisi * sisi dan mencetak hasilnya. */
        double luas = sisi * sisi;
        System.out.println("Luas " + getName() + " adalah: " + luas);
    }

    @Override
    public void hitungKeliling() {
        /*Meng-override metode hitungKeliling() untuk menghitung keliling persegi dengan rumus 4 * sisi dan mencetak hasilnya. */
        double keliling = 4 * sisi;
        System.out.println("Keliling " + getName() + " adalah: " + keliling);
    }
}

class Lingkaran extends BangunDatar {
    /*Mendefinisikan kelas Lingkaran sebagai turunan dari BangunDatar (child class). */
    private double radius;  /*Memiliki properti tambahan radius (jari-jari lingkaran). */

    public Lingkaran(String name, double radius) {
        /*emiliki constructor Lingkaran yang menerima dua argumen name dan radius, dan menginisialisasi properti name menggunakan constructor BangunDatar, serta properti radius dengan nilai argumen. */
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        /*Memiliki metode getRadius() yang mengembalikan nilai properti radius. */
        return radius;
    }

    @Override
    public void hitungLuas() {
        /*Meng-override metode hitungLuas() untuk menghitung luas lingkaran dengan rumus Math.PI * Math.pow(radius, 2) dan mencetak hasilnya. */
        double luas = Math.PI * Math.pow(radius, 2);
        System.out.println("Luas " + getName() + " adalah: " + luas);
    }

    @Override
    public void hitungKeliling() {
        /*Meng-override metode hitungKeliling() untuk menghitung keliling lingkaran dengan rumus 2 * Math.PI * radius dan mencetak hasilnya. */
        double keliling = 2 * Math.PI * radius;
        System.out.println("Keliling " + getName() + " adalah: " + keliling);
    }
}

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi("Persegi", 5);  /*Membuat objek Persegi dengan nama "Persegi" dan sisi 5. */
        System.out.println("Nama: " + persegi.getName()); /*Mencetak nama objek menggunakan metode getName()*/ 
        persegi.hitungLuas(); /*memanggil metode hitungLuas() */
        persegi.hitungKeliling(); /*memanggil metode hitungKeliling() pada objek Persegi */

        Lingkaran lingkaran = new Lingkaran("Lingkaran", 3); /*Membuat objek Lingkaran dengan nama "Lingkaran" dan radius 3. */
        System.out.println("Nama: " + lingkaran.getName()); /*Metode getName(): Metode ini ada pada kelas BangunDatar dan digunakan untuk mengembalikan nilai properti name dari objek. */
        lingkaran.hitungLuas(); /*memanggil metode hitungLuas() */
        lingkaran.hitungKeliling(); /*memanggil metode hitungKeliling() pada objek Persegi */
    }
}