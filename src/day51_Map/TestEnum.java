package day51_Map;

public class TestEnum {
    public static void main(String[] args) {




        Browser browser = Browser.CHROME;


        switch (browser){
            case EDGE:
                System.out.println("Edge is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
            case SAFARI:
                System.out.println("Safari is selected");
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;
            default:
                System.out.println("Chrome is selected");

        }

        System.out.println("-----------------------------");

        Season season = Season.WINTER;





    }
}
