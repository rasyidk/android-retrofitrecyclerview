package com.example.retrofitcobapagination;

public class ValueLaporan {
    private String judul_laporan;
    private String kategori_laporan;
    private String isi_laporan;
    private  String img_laporan;
    private String waktu_laporan;
    private String tanggal_laporan;
    private String nama_murid;
    private String id_laporan;
    private  String kelas;

    public ValueLaporan(String judul_laporan, String kategori_laporan, String isi_laporan, String img_laporan, String waktu_laporan, String tanggal_laporan, String nama_murid, String id_laporan, String kelas) {
        this.judul_laporan = judul_laporan;
        this.kategori_laporan = kategori_laporan;
        this.isi_laporan = isi_laporan;
        this.img_laporan = img_laporan;
        this.waktu_laporan = waktu_laporan;
        this.tanggal_laporan = tanggal_laporan;
        this.nama_murid = nama_murid;
        this.id_laporan = id_laporan;
        this.kelas = kelas;
    }

    public String getNama_murid() {
        return nama_murid;
    }

    public void setNama_murid(String nama_murid) {
        this.nama_murid = nama_murid;
    }

    public String getId_laporan() {
        return id_laporan;
    }

    public void setId_laporan(String id_laporan) {
        this.id_laporan = id_laporan;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTanggal_laporan() {
        return tanggal_laporan;
    }

    public void setTanggal_laporan(String tanggal_laporan) {
        this.tanggal_laporan = tanggal_laporan;
    }

    public String getWaktu_laporan() {
        return waktu_laporan;
    }

    public void setWaktu_laporan(String waktu_laporan) {
        this.waktu_laporan = waktu_laporan;
    }

    public String getJudul_laporan() {
        return judul_laporan;
    }

    public void setJudul_laporan(String judul_laporan) {
        this.judul_laporan = judul_laporan;
    }

    public String getKategori_laporan() {
        return kategori_laporan;
    }

    public void setKategori_laporan(String kategori_laporan) {
        this.kategori_laporan = kategori_laporan;
    }

    public String getIsi_laporan() {
        return isi_laporan;
    }

    public void setIsi_laporan(String isi_laporan) {
        this.isi_laporan = isi_laporan;
    }

    public String getImg_laporan() {
        return img_laporan;
    }

    public void setImg_laporan(String img_laporan) {
        this.img_laporan = img_laporan;
    }
}
