package D20123882; 

import processing.core.PApplet;


public class visual3 
{

    float shift = 0; 
    AlkimV sp; 

    public visual3(AlkimV sp)
    {
      this.sp=sp;
    }

    public void render()
    {
        sp.calculateAverageAmplitude();
        sp.background(1);
        sp.noFill();
        sp.lights();
        sp.stroke(PApplet.map(sp.getSmoothedAmplitude(), 0, 2, 0, 250), 250, 250); 
        sp.camera(0, 0, 0, 0, 0, -2, 0, 2, 0); 
        sp.translate(0, 0, -245); 
            
        {   
            //Bottomleft CUBE
            sp.pushMatrix();
            sp.translate(-160, 60, 0); 
            sp.rotateX(shift);
            sp.rotateY(shift);
           
            int L = 1; // for color 
            for (int j = 250; j > 0; j-=45) { // box size
                sp.box(j * sp.getSmoothedAmplitude() * 1.3f);
                L++;
                sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* L, 0, 1, 0, 255), 255, 255);
            }
            shift += 0.012f;
            sp.strokeWeight(2);
            sp.popMatrix();
            
            //TOPRIGHT CUBE
            sp.pushMatrix();
            sp.translate(160, -60, 0);
            sp.rotateY(shift);
            sp.rotateX(shift); 
            int R = 1; // for color
            for (int j = 250; j > 0; j-=45) { // box size
                sp.box(j * sp.getSmoothedAmplitude() * 1.3f);
                R++;
                sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* R, 0, 1, 0, 255), 255, 255);
            }
            shift += 0.012f;
            sp.strokeWeight(2); 
            sp.popMatrix();
            
            //TOPLEFT
            sp.pushMatrix();
            sp.translate(-160, -60, 0);
            sp.rotateY(shift);
            sp.rotateX(shift); 

            int T = 1; // for color
            for (int j = 250; j > 0; j-=45) { // box size
                sp.box(j * sp.getSmoothedAmplitude() * 1.3f);
                T++;
                sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* T, 0, 1, 0, 255), 255, 255);
            }
            shift += 0.012f;
            sp.strokeWeight(2); 
            sp.popMatrix();

            //Bottom right square
            sp.pushMatrix();
            sp.translate(160, 60, 0);
            sp.rotateY(shift);
            sp.rotateX(shift); 
            int A = 1; // for color
            for (int j = 250; j > 0; j-=45) { // box size
                sp.box(j * sp.getSmoothedAmplitude() * 1.3f);    
                A++;
                sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* A, 0, 1, 0, 255), 255, 255);
            }
            shift += 0.012f; 
            sp.strokeWeight(2); 
            sp.popMatrix();

            //rotate func
            sp.rotateZ(shift);
            //mid cube
            sp.strokeWeight(6);
            sp.box(100 * sp.getSmoothedAmplitude() * 1.3f);

            //spinning balls with color changes
            sp.pushMatrix();
            sp.translate(70, 0, 0);
            sp.sphere(30 * sp.getSmoothedAmplitude() * 2);
            sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* 2, 0, 1, 0, 255), 255, 255);
            sp.popMatrix();

            sp.pushMatrix();
            sp.translate(0, 70, 0);
            sp.sphere(30 * sp.getSmoothedAmplitude() * 2);
            sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* 4, 0, 1, 0, 255), 255, 255);
            sp.popMatrix();

            sp.pushMatrix();
            sp.translate(-70, 0, 0);
            sp.sphere(30 * sp.getSmoothedAmplitude() * 2);
            sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* 6, 0, 1, 0, 255), 255, 255);
            sp.popMatrix();

            sp.pushMatrix();
            sp.translate(0, -70, 0);
            sp.sphere(30 * sp.getSmoothedAmplitude() * 2);
            sp.stroke(PApplet.map(sp.getSmoothedAmplitude()* 8, 0, 1, 0, 255), 255, 255);
            sp.popMatrix();
        }
    }
}



