# Music Visualiser Project
Name: Alkim Berke Kas
Student Number: D20123882

# Description of the assignment
In this assignment we were tasked to create an audio-visual experience and pick a song or piece of music that we like. I thought I should pick a song that could make me and who ever plays the audio dance and vibe. Furthermore, I didn’t forget the fact that I should pick a song that can boost my energy and keep my focus on it thereby I picked the song “Back in time by Pitbull” which I found pretty responsive regarding to its basses.

# Instructions
- Press “1” To play the music 
- Press “2” to stop the music
- Press “3” for first vision
- Press “4” for second vision
- Press “5” for third vision 

# How it works
The AlkimV program is run by the Main file. The processor signals that link the files are stored in a PApplet.

```Java
public class Main
{	
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AlkimV());		
	}
	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}
```

PApplet is utilized by the Visual Class to build methods that may be used to read information from an audio file, such as the Amplitude and Frequency Bands. This class is extended by the "AlkimV" class, which means it may utilize the methods specified in the Visual class.
(I was able to reuse AlkimV's attributes and methods in other classes, as well as call methods from other visual classes in AlkimV.java, thanks to polymorphism. Because it extends the Visual class, the AlkimVclass makes advantage of inheritance.)
The visuals are contained in their own classes, however they are declared in the "AlkimV"class, which serves as a nexus for all of the visuals. The classes declared in the "AlkimV" class are shown in the code below:

```Java
public class AlkimV extends Visual {
    //Variables declarations etc
    visual3 sp;
    visual2 mt;
    visual1 gt;
    extend at;
    extend2 bt;
...
}
```

In order to be utilized in the AlkimV, the classes are created in the setup procedure.

```Java
public void setup() {
		...
        sp = new visual3(this); // case 3
        mt = new visual2(this); // case 4 polygon
        gt = new visual1(this); // case  5 dots
        at = new extend(this); // case 5 sphere
        bt = new extend2(this); // case 3 circles
    }
```
Because the Visual classes are declared in the "AlkimV" class, each must have a constructor to initialize the objects. In order to use the variables in "AlkimV" in the Visual class, a parameter for "AlkimV" is specified.

```Java
public extend(AlkimV at) {
        this.at = at;
    }
```
To switch between each of the Visuals, a switch statement is utilized. When a given key bound is hit, the render() function of a matching Visual is invoked. The digits 0 to 5 are used as key bindings in this example.
```Java

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
```
# What I am most proud of in the assignment
The aspect of the task that I am most proud of would be the whole project because it was a very calm journey in which I had lots of fun and danced like crazy at every stage of it even when I had to check and fix the errors and bugs again and again. I’ve learned a lot while observing and consuming almost every content in regard to the processing and of course Java to make this project and I feel like it changed my prejudice towards Java which came to existence after we have been taught Python and being told by lots of seniors that Python being the best and easiest but now without a doubt I can say that I enjoyed working on Java.
As for visions I’ve spent most of my time with the first one due to me trying to be creative and aiming for a good starter visual.

```Java
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
```
## YouTube Video
[![YouTube](http://img.youtube.com/vi/uuxfpTCMDyo/0.jpg)](https://www.youtube.com/watch?v=uuxfpTCMDyo)