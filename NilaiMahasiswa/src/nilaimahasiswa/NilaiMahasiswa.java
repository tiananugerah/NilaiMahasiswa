/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

import java.lang.reflect.Method;

/**
 *
 * @author Rizki Adam Kurniawan
 */
class NilaiAkhirMahasiswa {

    String nim;
    String name;
    char index;
    double uts, uas, quiz, nilai;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getIndex() {
        return index;
    }

    public void setIndex(char index) {
        this.index = index;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;

    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;

    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;

    }

    public void inputData() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + name);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + nim + "." + j);
        }
    }

    public void NilaiAkhir(double uts, double uas, double quiz) {
        double nQuiz = 0.2 * quiz;
        double nUts = 0.3 * uts;
        double nUas = 0.5 * uas;

        nilai = nQuiz + nUts + nUas;
        System.out.println("\nNilai Akhir \t= " + nilai);

    }

    public void NilaiIndex(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            index = 'A';
        } else if (nilai > 68 && nilai <= 80) {
            index = 'B';
        } else if (nilai > 56 && nilai <= 68) {
            index = 'C';
        } else if (nilai > 45 && nilai <= 56) {
            index = 'D';
        } else if (nilai <= 45) {
            index = 'E';
        }

        switch (index) {
            case 'A':

                System.out.println("\nIndex = " + index);
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");
        }
    }

}

public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiAkhirMahasiswa nmhs = new NilaiAkhirMahasiswa();
        nmhs.setNim("1.01.16.473");
        nmhs.setName("Tian Anugerah Mulyan");
        nmhs.setQuiz(75);
        nmhs.setUas(34);
        nmhs.setUts(45);
        nmhs.setIndex('o');
        nmhs.inputData();
        System.out.println("\nQUIZ \t\t= " + nmhs.getQuiz());
        System.out.println("UTS \t\t= " + nmhs.getUts());
        System.out.println("UAS \t\t= " + nmhs.getUas());
        nmhs.NilaiAkhir(nmhs.getUas(), nmhs.getUts(), nmhs.getQuiz());
        nmhs.NilaiIndex(nmhs.getNilai());

    }

}
