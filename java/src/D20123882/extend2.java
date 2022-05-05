package D20123882;

import processing.core.PApplet;

public class extend2 {
    
    AlkimV bt;

    public extend2(AlkimV bt) {
        this.bt = bt;
    }

    
    // circle-drawing
    public void render() { 
        bt.camera(0, 0, 0, 0, 0, -2, 0, 2, 0); 

        bt.pushMatrix();
        bt.translate(-955, -550, -2000);
        float c1 = PApplet.map(bt.getSmoothedAmplitude(), 0, 1, 10, 240);
        bt.stroke(c1, 100, 195);        
        bt.strokeWeight(5);
        bt.noFill();
        bt.ellipse(bt.width / 2, bt.height / 2, 1000 + (bt.getSmoothedAmplitude() * 400), 1000 + (bt.getSmoothedAmplitude() * 400)); 
        bt.ellipse(bt.width / 2, bt.height / 2, 800 + (bt.getSmoothedAmplitude() * 400), 800 + (bt.getSmoothedAmplitude() * 400)); 
        bt.popMatrix();
    }
}