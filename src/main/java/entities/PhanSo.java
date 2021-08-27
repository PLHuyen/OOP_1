package entities;

import java.util.Scanner;

public class PhanSo {

    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;

    }
    public PhanSo() {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void nhapPhanSo() {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Nhap tu so: ");
        a = scan.nextInt();
        System.out.print("Nhap mau so : ");
        b = scan.nextInt();
        tuSo = a;
        mauSo = b;
    }

     public void print() {
        System.out.format("%d/%d\n", tuSo, mauSo);
    }

    public void hienPs() {
        if (tuSo * mauSo < 0) {
            System.out.format("-%d/%d\n",Math.abs(tuSo), Math.abs(mauSo));
        } else {
            System.out.format("%d/%d\n",Math.abs(tuSo), Math.abs(mauSo));
        }
    }

    public PhanSo rutGon() {
        int x = UCLN(tuSo, mauSo);
        tuSo = tuSo / x;
        mauSo = mauSo / x;
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo tongPS(PhanSo ps2) {
        int a = tuSo * ps2.mauSo + mauSo * ps2.tuSo;
        int b = mauSo * ps2.mauSo;
        PhanSo psTong = new PhanSo(a, b);
        return psTong;
    }

    public PhanSo hieuPS(PhanSo ps2) {
        int a = tuSo * ps2.mauSo - mauSo * ps2.tuSo;
        int b = mauSo * ps2.mauSo;
        PhanSo psHieu = new PhanSo(a, b);
        return psHieu;
    }

    public PhanSo tichPS(PhanSo ps2) {
        int a = tuSo * ps2.tuSo;
        int b = mauSo * ps2.mauSo;
        PhanSo psTich = new PhanSo(a, b);
        return psTich;
    }

    public PhanSo thuongPS(PhanSo ps2) {
        int a = tuSo * ps2.mauSo;
        int b = mauSo * ps2.tuSo;
        PhanSo psThuong = new PhanSo(a, b);
        return psThuong;
    }

    public int UCLN(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public boolean psToiGian() {
        if (UCLN(tuSo, mauSo) == 1) {
            return true;
        }
        return false;
    }

    public int BSCNN(int a, int b) {
        int ret;
        ret = a * b / UCLN(a, b);
        return ret;
    }

    public PhanSo quydongPSo(PhanSo ps2) {
        int tmp = BSCNN(mauSo, ps2.mauSo) / mauSo;
        tuSo = tuSo * tmp;
        mauSo = mauSo * tmp;
        return new PhanSo(tuSo, mauSo);
    }

    public boolean ktPs() {
        if (tuSo * mauSo > 0) {
            return true;
        }
        return false;
    }

    public int sosanhPs(PhanSo ps2) {
        int ret;
        float s1 = (float) (tuSo / mauSo);
        float s2 = (float) (ps2.tuSo / ps2.mauSo);
        if (s1 > s2) {
            return ret = 1;
        } else if (s1 == s2) {
            return ret = 0;
        }
        else return ret = -1;
    }
}
