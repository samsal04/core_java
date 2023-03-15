package com.apolis.stringmanipulation;
//Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems.
//It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
//Ribonucleic acid, RNA, is the primary messenger molecule in cells.
//RNA differs slightly from DNA its chemical structure and contains no Thymine.
//In RNA Thymine is replaced by another nucleic acid Uracil ('U').
//Create a function which translates a given DNA string into RNA.
//
//        For example:
//        "GCAT"  =>  "GCAU"

public class DnaToRna {
    private static String dnaToRna(String dna) {
        StringBuilder stringBuilder= new StringBuilder();

        dna.replace('T','U');
        for(int i=0;i<dna.length();i++){

            if(dna.charAt(i)=='T'){
                stringBuilder.append('U');
            }
            else {
                stringBuilder.append(dna.charAt(i));
            }
        }
        dna=String.valueOf(stringBuilder);
        return dna;
    }
    public static void main(String[] args) {
        String s="GCAT";
        System.out.println(dnaToRna(s));
    }
}
