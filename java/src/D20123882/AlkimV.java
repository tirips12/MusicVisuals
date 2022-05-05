package D20123882;

import ie.tudublin.Visual;

public class AlkimV extends Visual {
    //Variables declarations etc
    visual3 sp;
    visual2 mt;
    visual1 gt;
    extend at;
    extend2 bt;


    //menu option
    int choose = 0;

    public void settings() {
        
        fullScreen(P3D, SPAN);

    }

    //controls 
    public void keyPressed() {
        if (key >= '0' && key <= '5') {
            choose = key - '0';
        }

    }

    public void setup() {
        colorMode(HSB);
        startMinim();
        loadAudio("BackinTime.mp3");
        

        sp = new visual3(this); // case 3
        mt = new visual2(this); // case 4 polygon
        gt = new visual1(this); // case  5 dots
        at = new extend(this); // case 5 sphere
        bt = new extend2(this); // case 3 circles
        
    }


    public void draw() {
        background(0);
        calculateAverageAmplitude();
        calculateFrequencyBands();
        switch (choose) {
            case 0:{
                getAudioPlayer().cue(0);  //same thing review
                text("Press 1 to Play, 2 to pause, between 3-5 for Visuals!", width/4  , height/2);
                textSize(40);
                break;
            }
            case 1:
                {
                    getAudioPlayer().play();
                    break;
                }
            case 2:
                {
                    getAudioPlayer().pause();
                    break;
                }
            case 3:
                {
                    sp.render();
                    bt.render();
                    break;                }
            case 4:
                {
                    mt.render();
                    break;
                }
            case 5:
                {

                    gt.render();
                    at.render();
                    break;
                }     
        }
    }
}