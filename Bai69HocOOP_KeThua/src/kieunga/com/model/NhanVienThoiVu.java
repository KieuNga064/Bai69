package kieunga.com.model;

public class NhanVienThoiVu extends NhanVien{
	public NhanVienThoiVu()
	{
		super();
	}
	public NhanVienThoiVu(int ma, String ten)
	{
		super(ma, ten);
	}
	public void tinhLuong()
	{
		super.tinhLuong();
		System.out.println("==> đây là nhân viên thời vụ.");
	}
}
