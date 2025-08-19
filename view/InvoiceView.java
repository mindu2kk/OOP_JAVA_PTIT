/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;

import vn.edu.ptit.Invoice;
import vn.edu.ptit.Subject;

/**
 *
 * @author TienNV
 */
public class InvoiceView {

    public static void show(Invoice invoice) {
        System.out.println("Mã sinh viên: " + invoice.getSt().getCode());
        System.out.println("Họ tên: " + invoice.getSt().getName());
        System.out.println("Các môn học:");
        for (Subject subject : invoice.getAlSubject()) {
            System.out.println(subject.getName());
        }
        System.out.println("Học phí phải nộp là: " + invoice.getAmount());
        System.out.println("Theo QĐ: " + invoice.getRule().getCode());
    }
    
}
