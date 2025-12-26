# Aplikasi Tiket Bioskop

Aplikasi desktop berbasis **Java Swing** ini dirancang untuk mengelola tiket bioskop.  
Aplikasi menyediakan fitur login, manajemen data tiket (CRUD), dan integrasi dengan API eksternal untuk penyimpanan data.

---

## Fitur Utama

1. **Login Pengguna**
   - Username: `viya`
   - Password: `keceee`
   - Hanya pengguna yang terverifikasi yang dapat mengakses aplikasi.

2. **Dashboard**
   - Menyediakan antarmuka awal yang intuitif.
   - Memungkinkan navigasi cepat ke daftar tiket, input tiket baru, atau keluar dari aplikasi.

3. **Manajemen Tiket**
   - Menampilkan seluruh tiket yang tersimpan.
   - Memungkinkan pengguna untuk memilih tiket tertentu untuk diedit atau dihapus.

4. **Input dan Pembaruan Tiket**
   - Menambahkan tiket baru atau memperbarui tiket yang sudah ada.
   - Validasi input memastikan semua field terisi dan harga berupa angka.
   - Data tiket dikirim ke API eksternal (`http://localhost:8080/api/tiket`) secara otomatis.

5. **Penyimpanan Data Lokal**
   - Data tiket disimpan dalam file `tiket.csv`.
   - Data akan dimuat kembali saat aplikasi dijalankan kembali.

6. **Desain Antarmuka**
   - Menggunakan kombinasi warna soft pink dan hitam.
   - Font modern dengan tampilan panel yang rapi dan responsif.

---

## Struktur Proyek

Proyek ini memiliki struktur sebagai berikut:
