package tj.sse.restaurant.cleanrestaurant;

/**
 * @Classname Kitchen
 * @Description TODO
 * @Author Administrator
 * @Date 2021/11/4 23:13
 * @Version 1.0
 **/
class Kitchen implements ICleanable {//打扫厨房

    public void cleaned() {
        System.out.println("完成后厨每日的清扫");
    }
}
