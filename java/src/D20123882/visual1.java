package D20123882;

import processing.core.PApplet;

public class visual1 extends AlkimV {
    AlkimV gt;
    float shift = 0;

    public visual1(AlkimV gt) {
        this.gt = gt;
    }
    
    public void render() {
        //points / little dots movin around
        gt.camera(0, 0, 300, 0, 0, 0, 2, 0, 0);
        gt.translate(0, 0, -30);
        
        gt.strokeWeight(13);
        //dots re not so little after strokeweight :))
        gt.rotate(PApplet.radians(shift));
        for(float i = 0; i < PApplet.TWO_PI; i += 0.2f) {
            float cl = PApplet.map(i, 0, PApplet.TWO_PI, 0, 230);
            gt.stroke(cl, 240, 240);
            
            float a = 50 * PApplet.cos(4 * i);
            float b = a * PApplet.cos(i);
            float c = a * PApplet.sin(i);
            gt.point(18 *(b * gt.getSmoothedAmplitude()), 18 * (c * gt.getSmoothedAmplitude()));
            shift += 1.05f;
        }


                
    }
}