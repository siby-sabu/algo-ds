package dsa;

class Ruler {
    public static void main(String[] args) {
        int rulerlen = 4;
        int maxlines = 3;
        createRuler(rulerlen,maxlines);
    }

    private static void createRuler(int rulerlen, int maxlines) {
        drawLine(maxlines, 0);
        for(int i=1;i<rulerlen;i++){
            drawInterval(maxlines-1);
            drawLine(maxlines,i);
        }
    }

    private static void drawLine(int maxlines, int val) {
        for(int i=0;i<maxlines;i++){
            System.out.print("-");
        }
        if(val >= 0) {
            System.out.print(val);
        }
        System.out.print('\n');
    }

    private static void drawLine(int maxlines){
        drawLine(maxlines,-1);
    }

    private static void drawInterval(int interval){
        if(interval >0){
            drawInterval(interval-1);
            drawLine(interval);
            drawInterval(interval-1);
        }

    }
}