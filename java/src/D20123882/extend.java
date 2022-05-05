package D20123882;

import processing.core.PApplet;

public class extend extends AlkimV{
    
    AlkimV at;

    public extend(AlkimV at) {
        this.at = at;
    }

    float shift = 0;

    //a spiral sphere drawn on the screen
    public void render() { 
        at.camera(0, 0, 0, 0, 0, -2, 0, 2, 0); 

        at.pushMatrix();
        at.translate(0, 0, -200);
        at.rotateX(shift);
        at.rotateY(shift);
        at.noFill();
        at.stroke(PApplet.map(at.getSmoothedAmplitude(), 0, 2, 190, 220), 210, 210);
        at.strokeWeight(2);
        at.sphere(180 + (950 * at.getSmoothedAmplitude()));
        at.popMatrix();
        shift += 0.05f;

    }
    

}
