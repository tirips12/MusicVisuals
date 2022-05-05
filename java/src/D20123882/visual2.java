package D20123882;

import processing.core.PApplet;
public class visual2 extends AlkimV
{
    AlkimV mt;
    public float spin = 0;

    public visual2(AlkimV mt)
    {
        this.mt = mt;
    }

    public void render()
    {
        mt.camera(0, 0, 0, 0, 0, -2, 0, 2, 0); 
        mt.translate(0, 0, -1000); 
        mt.pushMatrix();
        //polygon build up from square 
        //change size and color
        for(int i = 4; i < 16 ; i++)
        {
            mt.rotate(spin * i);
            float matb = TWO_PI / (float) i;
            float amplify = 52 * i * mt.getSmoothedAmplitude();
            float ratio = i * 20 + amplify;
            mt.stroke(215);
            mt.strokeWeight(2);
            for(int v = 1 ; v <= i ; v ++)
            {
                float a1 = sin(matb * (v - 1)) * ratio;
                float b1 = cos(matb * (v - 1)) * ratio;
                float a2 = sin(matb * v) * ratio;
                float b2 = cos(matb * v) * ratio;
                float d = map(i - 4, 0, 13, 0, 255);
                mt.stroke(d, 255, 255);
                mt.line(0 + a1, 0 + b1, 0 + a2, 0 + b2);
            }
        }
        mt.popMatrix();
        shift();
        // eye looking trippy circle
        mt.pushMatrix();
        mt.translate(-955, -550, -2000);
        float c = PApplet.map(mt.getSmoothedAmplitude(), 0, 5, 40, 250);
        mt.stroke(c, 60, 255);        
        mt.strokeWeight(5);
        mt.noFill();
        mt.ellipse(mt.width / 2, mt.height / 2, 120 + (mt.getSmoothedAmplitude() * 100), 120 + (mt.getSmoothedAmplitude() * 100)); 
        mt.popMatrix();
    }

    public void shift()
    {        
        spin = spin + mt.getSmoothedAmplitude() * 0.2f;
    }
}