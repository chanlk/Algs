package chap1;

/**
 * @description: 基本常量
 * @author: Chanlk
 * @create: 2018-08-19 18:20
 **/

enum BaseEnum {

    S_SIZE(100),
    M_SIZE(10000),
    B_SIZE(1000000),
    H_SIZE(100000000),;//一亿

    int SIZE = 0;

    BaseEnum(int SIZE) {
        this.SIZE = SIZE;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getSIZE() {
        return SIZE;
    }

    public void setSIZE(int SIZE) {
        this.SIZE = SIZE;
    }
}
