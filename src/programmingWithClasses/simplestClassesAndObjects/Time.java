package programmingWithClasses.simplestClassesAndObjects;
//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.
public class Time {
    private int hour;
    private int minute;
    private int sec;

    public static void main(String[] args) {
        Time time = new Time(25,45,10);
        System.out.println(time.getHour()+":"+ time.getMinute()+":"+ time.getSec());

        for (int i = 0; i < 70; i++) {
            time.changeTimeTo(0,0,1);
        }
        System.out.println(time.getHour()+":"+ time.getMinute()+":"+ time.getSec());
        time.setHour(23);
        System.out.println(time.getHour()+":"+ time.getMinute()+":"+ time.getSec());
    }

    public Time(int hour1, int minute1, int sec1) {
        hour = hour1;
        minute = minute1;
        sec = sec1;

        if(hour>24||hour<0){
            hour=0;
        }
        if(minute>60||minute<0){
            minute=0;
        }
        if(sec>60||sec<0){
            sec=0;
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
        if(hour>24||hour<0){
            this.hour=0;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute;
        if(minute>60||minute<0){
            this.minute=0;
        }

    }

    public void setSec(int sec) {
        this.sec = sec;
        if(sec>60||sec<0){
            this.sec=0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSec() {
        return sec;
    }

    public void changeTimeTo(int hour1, int minute1, int sec1){
        hour += hour1;
        minute += minute1;
        sec += sec1;
        if(sec>=60){
            int sh =sec/60;
            minute += sh;
            sec=sec%60;
        }
        if(minute>=60){
            int sh =minute/60;
            hour += sh;
            minute=minute%60;
        }
        if(hour>=24){
            hour=hour%60;
        }

    }

}
