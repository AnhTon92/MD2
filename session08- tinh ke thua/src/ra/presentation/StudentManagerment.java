package ra.presentation;

import ra.business.config.InputMethods;
import ra.business.design.CRUD;
import ra.business.implement.MarkImplement;
import ra.business.implement.StudentImplement;

public class StudentManagerment {
    public static CRUD studentImplement = new StudentImplement();
    public static CRUD markImplement = new MarkImplement();
    public static void main(String[] args) {
        while (true){
            System.out.println("--------------------MENU-------------------");
            System.out.println("1. Nhập mới sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Cập nhật thông tin");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.println("Nhạp chuc năng");
            byte choice = InputMethods.getByte(); // -128 -> 127
            switch (choice){
                case 1:
                    studentImplement.create();
                    break;
                case 2:
                    studentImplement.display();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thoat");
                    return;
                default:
                    System.err.println("Nhap sai");
            }
        }
    }
}
