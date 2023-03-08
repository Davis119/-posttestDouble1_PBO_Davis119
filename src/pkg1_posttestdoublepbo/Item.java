/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_posttestdoublepbo;

import java.util.Scanner;

public class Item {
    private String judul;//atribut ini berfungsi sebagai variabel untuk menyimpan input judul 
    private String genre;//atribut ini berfungsi sebagai variabel untuk menyimpan input genre  
    private String status;//atribut ini berfungsi sebagai variabel untuk menyimpan input status
    private String author;//atribut ini berfungsi sebagai variabel untuk menyimpan input author
    private double rating;//atribut ini berfungsi sebagai variabel untuk menyimpan input rating

    public Item() {
    }

    public void addNewItem() {   //method ini berguna untuk menambahkan item baru 
                                 //dia akan meminta input dari user untuk mengisi 
                                 //nilai atribut judul, genre, status, author, dan rating
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul: ");
        judul = input.nextLine();
        
        
        System.out.print("Masukkan Genre: ");
        genre = input.nextLine();
        
       
        System.out.print("Masukkan Status: ");
        status = input.nextLine();
        
        
        System.out.print("Masukkan Author: ");
        author = input.nextLine();
        
        System.out.print("Masukkan Rating: ");
        rating = input.nextDouble();
    }

    public void setJudul(String judul) {  //berfungsi sebagai input nilai atribut judul
        this.judul = judul;
    }

    public String getJudul() {   //untuk mengambil isi nilai dari atribut judul
        return judul;
    }
    
     public void setGenre(String genre) {  //berfungsi sebagai input nilai atribut genre
        this.genre = genre;
    }

    public String getGenre() {   //untuk mengambil isi nilai dari atribut genre
        return genre;
    }
    
    public void setRating(double rating) { //berfungsi sebagai input nilai atribut rating
        this.rating = rating;
    }

    public double getRating() {  //untuk mengambil isi nilai dari atribut rating
        return rating;
    }
    
    

    

    @Override
    public String toString() {
        return judul + " (Genre: " + genre + ", Status: " + status + ", Author: " + author + ", Rating: " + rating +  ")";
    }

}

