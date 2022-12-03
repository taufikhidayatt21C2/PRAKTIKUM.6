public abstract class kelasAbstrak {

    public kelasAbstrak() {
        tulis("Method ini dieksekusi pada saat instance class");
    }

    public void  tulis(String teks) {
        System.out.print(teks);
    }

    public abstract  void callMe();
}
