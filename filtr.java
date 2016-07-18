
package filtry;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_core.CV_32FC1;
import com.googlecode.javacv.cpp.opencv_core.CvMat;
import static com.googlecode.javacv.cpp.opencv_core.IPL_DEPTH_32F;
import static com.googlecode.javacv.cpp.opencv_core.IPL_DEPTH_8U;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_core.cvGet2D;
import static com.googlecode.javacv.cpp.opencv_core.cvGetMat;
import static com.googlecode.javacv.cpp.opencv_core.cvRect;
import static com.googlecode.javacv.cpp.opencv_core.cvSet2D;
import static com.googlecode.javacv.cpp.opencv_core.cvSetImageROI;
import static com.googlecode.javacv.cpp.opencv_highgui.CV_WINDOW_AUTOSIZE;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvNamedWindow;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_COLOR;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE;
import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvGetSize;
import static com.googlecode.javacv.cpp.opencv_core.cvResetImageROI;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_GAUSSIAN;
import static com.googlecode.javacv.cpp.opencv_imgproc.CV_MEDIAN;
import static com.googlecode.javacv.cpp.opencv_imgproc.cvSmooth;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Grzegorz
 */
public class filtr extends javax.swing.JFrame {
    
    private File filetoSave;
    private BufferedImage image2;
    private BufferedImage image3;

    private File fileZapis;
    
        public filtr() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        db = new javax.swing.JFileChooser();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        jButton13.setText("jButton13");

        jButton14.setText("jButton14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("FILTRY");

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("     PRZETWARZANIE OBRAZÓW");

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Wczytaj i wyświetl obraz w Gray Scale");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Wyliczenie maski Grey przez dodanie masek RGB i wyświetlenie ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Wczytaj i wyświetl oryginalny obraz z katalogu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Filtr medianowy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Filtr gaussowski ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setText("Maska czerwona obrazka");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 255, 102));
        jButton8.setText("Maska zielona obrazka");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 255));
        jButton9.setText("Maska niebieska obrazka");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setText("Wczytaj Zaszumiony Obrazek");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setText("Filtr Medianowy Funkcja OpenCV");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 153, 153));
        jButton15.setText("Wczytaj Czysty Obrazek");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      IplImage image3 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\czysty.jpg",CV_LOAD_IMAGE_GRAYSCALE);
      final CanvasFrame canvas2 = new CanvasFrame("image3");
      canvas2.showImage(image3);       

                          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
IplImage image3 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\czysty.jpg",CV_LOAD_IMAGE_GRAYSCALE);
    double r, g, b;
    r = g = b = 0.0;       
     CvMat mtx = CvMat.createHeader(image3.height(), image3.width(), CV_32FC1); 
    cvGetMat(image3, mtx, null, 0); 
    System.out.println(mtx.rows() + "x" + mtx.cols());
    for (int i = 0; i < mtx.rows(); i++)
    {
        for (int j = 0; j < mtx.cols(); j++)
        {
            opencv_core.CvScalar rgb = cvGet2D(mtx, i, j);
            r = rgb.val(0);
            g = rgb.val(2);
            b = rgb.val(1);
                                              //konwersja obrazka RGB na grayscale przez zsumowanie masek
            double gray = ( 0.3 * r + 0.6 *g + 0.1* b) ; //wartosc luminancji, ilosc koloru 
            opencv_core.CvScalar scalar = new opencv_core.CvScalar();
            scalar.setVal(0, gray);
            scalar.setVal(1, gray);
            scalar.setVal(2, gray);
            cvSet2D(mtx, i, j, scalar);
 //struktura ta pozwala przechowywac maksymalnie cztery wartości typudouble. Jej parametrem jest wskaźnik do czteroelementowej 
//tablicy elementów typu double
        }   
    }        
    IplImage result = new IplImage(mtx);  
    cvSaveImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\manual_gray.jpg", result);
    IplImage foto = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\manual_gray.jpg");
    final CanvasFrame canvas4 = new CanvasFrame("foto.jpg");
     canvas4.showImage(foto);  
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 IplImage image4 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\czysty.jpg",CV_LOAD_IMAGE_COLOR);
 final CanvasFrame canvas5 = new CanvasFrame("image4");
   canvas5.showImage(image4);      
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  //Przechwytuje kolor 9 pikseli 
 //Odłączyć R, G i B każdej wartości piksela i umieścić je w Array.sort the arrays.Get Znajduje się tam wartość tablicy
 //czyli mediana wartości kolorów w tych 9 pixelach.Set kolor scala na piksel docelowy 
        
        try {                                          
            File f=new File("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\zaszumiony.jpg");   
            
            Color[] pixel=new Color[9];
            int[] R=new int[9];
            int[] B=new int[9];
            int[] G=new int[9];
            File output=new File("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\medianowyalgorytm.jpg");
            BufferedImage img=ImageIO.read(f);
            BufferedImage img1=ImageIO.read(f);
             final CanvasFrame canvas11 = new CanvasFrame("zaszumiony.jpg");
                 canvas11.showImage(img1);
                    //pętle przechodzą po kolejnych pixelach   po wysokości oraz szerokości obrazka  
                 for(int i=1;i<img.getWidth()-1;i++)
                for(int j=1;j<img.getHeight()-1;j++)       //wybrane otoczenie pixela badanego to kwadrat 3x3
                {
                    pixel[0]=new Color(img.getRGB(i-1,j-1));
                    pixel[1]=new Color(img.getRGB(i-1,j));
                    pixel[2]=new Color(img.getRGB(i-1,j+1));
                    pixel[3]=new Color(img.getRGB(i,j+1));
                    pixel[4]=new Color(img.getRGB(i+1,j+1));
                    pixel[5]=new Color(img.getRGB(i+1,j));
                    pixel[6]=new Color(img.getRGB(i+1,j-1));
                    pixel[7]=new Color(img.getRGB(i,j-1));
                    pixel[8]=new Color(img.getRGB(i,j));
                    for(int k=0;k<9;k++){
                        R[k]=pixel[k].getRed();   //pobieranie składowych red green blue
                        B[k]=pixel[k].getBlue();
                        G[k]=pixel[k].getGreen();
                    }
                    Arrays.sort(R);
                    Arrays.sort(G); //sortowanie elementow otoczenia badanego pixela
                    Arrays.sort(B);
                    img.setRGB(i,j,new Color(R[4],B[4],G[4]).getRGB());
//wybór wartości środkowej, czyli mediany, dla każdej z masek i zapisanie nowej wartości do nowego obrazka
                     }
            try {
                ImageIO.write(img,"jpg",output);
               final CanvasFrame canvas10 = new CanvasFrame("medianowyalgorytm.jpg");
                 canvas10.showImage(img);
            } catch (IOException ex) {
                Logger.getLogger(filtr.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(filtr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   IplImage img1 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\zaszumiony.jpg",CV_LOAD_IMAGE_GRAYSCALE);
   cvSetImageROI(img1, cvRect(10, 15, 512, 512)); //Funkcja odpowiedzialna za określanie prostokątnego obszaru 
   IplImage img2 = cvCreateImage(cvGetSize(img1),IPL_DEPTH_8U, 1);
   cvSmooth( img1, img2, CV_GAUSSIAN, 11, 11 ,5,5);
   
    //cvResetImageROI(img1);
 
 cvSaveImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\GAUSSIAN.jpg",img2);
 final CanvasFrame canvas9 = new CanvasFrame("img1");
     canvas9.showImage(img1); 
 final CanvasFrame canvas4 = new CanvasFrame("img2");
     canvas4.showImage(img2); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
IplImage image5 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\Czysty.jpg",CV_LOAD_IMAGE_COLOR);
    double r, g, b;
    r = g = b = 0.0;       
     CvMat mtxred = CvMat.createHeader(image5.height(), image5.width(), CV_32FC1); 
    cvGetMat(image5, mtxred, null, 0); 

    System.out.println(mtxred.rows() + "x" + mtxred.cols());

    for (int i = 0; i < mtxred.rows(); i++)
    {
        for (int j = 0; j < mtxred.cols(); j++)
        {
            opencv_core.CvScalar rgb = cvGet2D(mtxred, i, j);
            r = rgb.val(0);
            g = rgb.val(2);
            b = rgb.val(1);
            double gray1 = ( 0.3 * r + 0.0 *g + 0.0 * b) ; 
            opencv_core.CvScalar scalare = new opencv_core.CvScalar();
//struktura ta pozwala przechowywac maksymalnie cztery wartości typudouble. Jej parametrem jest wskaźnik do czteroelementowej 
//tablicy elementów typu double
            scalare.setVal(0, gray1);
            scalare.setVal(1, gray1);
            scalare.setVal(2, gray1);
            cvSet2D(mtxred, i, j, scalare);
        }
        }
    IplImage resultred = new IplImage(mtxred);  
    cvSaveImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\maskred.jpg", resultred);
    IplImage fotosred = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\maskred.jpg");
    final CanvasFrame canvas6 = new CanvasFrame("fotosred");
     canvas6.showImage(fotosred); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
IplImage image5 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\czysty.jpg",CV_LOAD_IMAGE_COLOR);
    double r, g, b;
    r = g = b = 0.0;       
     CvMat mtxgreen = CvMat.createHeader(image5.height(), image5.width(), CV_32FC1); //macierz pixeli
    cvGetMat(image5, mtxgreen, null, 0); 

    System.out.println(mtxgreen.rows() + "x" + mtxgreen.cols());

    for (int i = 0; i < mtxgreen.rows(); i++)
    {
        for (int j = 0; j < mtxgreen.cols(); j++)
        {
            opencv_core.CvScalar rgb = cvGet2D(mtxgreen, i, j);
            r = rgb.val(0);
            g = rgb.val(2);
            b = rgb.val(1);
            double gray1 = ( 0.0 * r + 0.6 *g + 0.0 * b) ; 
            opencv_core.CvScalar scalare = new opencv_core.CvScalar();
            scalare.setVal(0, gray1);
            scalare.setVal(1, gray1);
            scalare.setVal(2, gray1);
            cvSet2D(mtxgreen, i, j, scalare);
        }
        }
    IplImage resultgreen = new IplImage(mtxgreen);  
    cvSaveImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\maskgreen.jpg", resultgreen);
    IplImage fotosgreen = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\maskgreen.jpg");
    final CanvasFrame canvas6 = new CanvasFrame("fotosgreen");
     canvas6.showImage(fotosgreen); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
IplImage image5 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\czysty.jpg",CV_LOAD_IMAGE_COLOR);
    double r, g, b;
    r = g = b = 0.0;       
     CvMat mtxgreen = CvMat.createHeader(image5.height(), image5.width(), CV_32FC1); 
    cvGetMat(image5, mtxgreen, null, 0); 

    System.out.println(mtxgreen.rows() + "x" + mtxgreen.cols());

    for (int i = 0; i < mtxgreen.rows(); i++)
    {
        for (int j = 0; j < mtxgreen.cols(); j++)
        {
            opencv_core.CvScalar rgb = cvGet2D(mtxgreen, i, j);
            r = rgb.val(0);
            g = rgb.val(2);
            b = rgb.val(1);
            double gray1 = ( 0.0 * r + 0.0 *g + 0.1 * b) ; 
            opencv_core.CvScalar scalare = new opencv_core.CvScalar();
            scalare.setVal(0, gray1);
            scalare.setVal(1, gray1);
            scalare.setVal(2, gray1);
            cvSet2D(mtxgreen, i, j, scalare);
        }
        }
    IplImage resultgreen = new IplImage(mtxgreen);  
    cvSaveImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\maskblue.jpg", resultgreen);
    IplImage fotosblue = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\maskblue.jpg");
    final CanvasFrame canvas6 = new CanvasFrame("fotosblue");
     canvas6.showImage(fotosblue);         
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
                        JFileChooser fc=new JFileChooser();
                        
                        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                        fc.addChoosableFileFilter(filter);
                        int returnVal=fc.showOpenDialog(null);
                        if(returnVal==JFileChooser.APPROVE_OPTION){
                            filetoSave=fc.getSelectedFile();
                            String path=filetoSave.getAbsolutePath();
                            File obraz=new File(path);
                            try{
                             image2=ImageIO.read(obraz);
                            }catch(IOException w){
                                System.out.println("Nie wczytano");
                            }  
                      
                        }
     final CanvasFrame canvas30 = new CanvasFrame("Picture");
     canvas30.showImage(image2); 
           try{
                                fileZapis=new File("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\Zaszumiony.jpg");
                                ImageIO.write(image2,"jpg",fileZapis);
                                      
                            }catch(IOException e){
                                System.err.println("Nie zapisało");
                            }
     
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
IplImage img1 = cvLoadImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\Zaszumiony.jpg",CV_LOAD_IMAGE_GRAYSCALE);

 cvSetImageROI(img1, cvRect(10, 15, 512, 512));
 
  IplImage img2 = cvCreateImage(cvGetSize(img1),IPL_DEPTH_8U, 1);
   cvSmooth( img1, img2, CV_MEDIAN, 9, 9,0,0);
   //cvResetImageROI(img1);
  
 cvSaveImage("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\median.jpg",img2);
 final CanvasFrame canvas9 = new CanvasFrame("img1");
     canvas9.showImage(img1); 
 final CanvasFrame canvas8 = new CanvasFrame("img2");
     canvas8.showImage(img2);         
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
   JFileChooser fc=new JFileChooser();
                        
                        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images", "jpg","gif","png");
                        fc.addChoosableFileFilter(filter);
                        int returnVal=fc.showOpenDialog(null);
                        if(returnVal==JFileChooser.APPROVE_OPTION){
                            filetoSave=fc.getSelectedFile();
                            String path=filetoSave.getAbsolutePath();
                            File obraz=new File(path);
                            try{
                             image3=ImageIO.read(obraz);
                            }catch(IOException w){
                                System.out.println("Nie wczytano");
                            }  
                      
                        }
     final CanvasFrame canvas30 = new CanvasFrame("Obrazek");
     canvas30.showImage(image3); 
           try{
                                fileZapis=new File("C:\\Users\\Grzegorz\\Documents\\Netbeans\\Filtry\\src\\filtry\\Czysty.jpg");
                                ImageIO.write(image3,"jpg",fileZapis);
                                      
                            }catch(IOException e){
                                System.err.println("Nie zapisało");
                            }
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(filtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filtr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filtr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser db;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
