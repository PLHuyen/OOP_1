import entities.PhanSo;

public class APP {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo ps3 = new PhanSo();
        PhanSo ps4 = new PhanSo();
        PhanSo psTong = new PhanSo();
        PhanSo psHieu = new PhanSo();
        PhanSo psTich = new PhanSo();
        PhanSo psThuong = new PhanSo();
        PhanSo psQuyDong1 = new PhanSo();
        PhanSo psQuyDong2 = new PhanSo();

        //Nhập phân số
        System.out.println("Nhập phân số 1: ");
        ps1.nhapPhanSo();
        ps1.hienPs();
        System.out.println("Phân số rút gọn là: ");
        ps1.rutGon().hienPs();

        System.out.println("Nhập phân số 2: ");
        ps2.nhapPhanSo();
        ps2.hienPs();
        System.out.println("Phân số rút gọn là: ");
        ps2.rutGon().hienPs();

        //tính tổng 2 phân số
        psTong = ps1.tongPS(ps2);
        System.out.println("Tổng 2 phân số là : ");
        psTong.hienPs();

        //tính hiệu 2 phân số
        psHieu = ps1.hieuPS(ps2);
        System.out.println("Hiệu 2 phân số là : ");
        psHieu.hienPs();

        //tính tích 2 phân số
        psTich = ps1.tichPS(ps2);
        System.out.println("Tích 2 phân số là : ");
        psTich.hienPs();

        //tính thương 2 phân số
        psThuong = ps1.thuongPS(ps2);
        System.out.println("Thương 2 phân số là : ");
        psThuong.hienPs();

        //quy đồng
        psQuyDong1 = ps1.quydongPSo(ps2);
        psQuyDong2 = ps2.quydongPSo(ps1);
        System.out.println("Phân số quy đồng của phân số 1 là: ");
        psQuyDong1.hienPs();
        System.out.println();
        System.out.println("Phân số quy đồng của phân số 2 là: ");
        psQuyDong2.hienPs();

        //so sánh
        if (ps1.sosanhPs(ps2)==1) {
            System.out.println("Phân số 1 lớn hơn phân số 2");
        }
        else if(ps1.sosanhPs(ps2)==0){
            System.out.println("Phân số 1 bằng phân số 2");
        }
        else System.out.println("Phân số 1 nhỏ hơn phân số 2");

        //phân số tối giản
        System.out.println("Kiểm tra phân số tối giản");
        ps3.nhapPhanSo();
        if (ps3.ktPs()) {
            System.out.println("Phân số tối giản");
        } else {
            System.out.println("Phân số chưa tối giản");
        }

        //Phân số âm dương
        System.out.println("Kiểm tra phân số âm dương");
        ps4.nhapPhanSo();
        if (ps4.ktPs()) {
            System.out.println("Phân số dương");
        } else {
            System.out.println("Phân số âm");
        }

    }
}

