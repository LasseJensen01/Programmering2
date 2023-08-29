package Ex01;

public class Filter5000 implements Filter{


    @Override
    public boolean accept(Measurable x) {
        if (x.getMeasure() > 5000){
            return true;
        } else return false;
    }
}
