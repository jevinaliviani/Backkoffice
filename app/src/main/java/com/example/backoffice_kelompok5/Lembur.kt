package com.example.backoffice_kelompok5

data class Lembur(
    val nama: String,
    val durasi:Int,
    val tanggal: String,
    val divisi: String,
    val alasan: String,
){
    constructor() : this("", 0, "", "", "")
}