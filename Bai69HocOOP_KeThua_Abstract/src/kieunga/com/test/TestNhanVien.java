package kieunga.com.test;

import kieunga.com.model.NhanVienChinhThuc;
import kieunga.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1, "Tèo");
		teo.tinhLuong();
		NhanVienThoiVu ty=new NhanVienThoiVu(2, "Tý");
		ty.tinhLuong();
		
	}

}
