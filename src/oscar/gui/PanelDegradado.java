package oscar.gui;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Oscar Javier Blancarte Iturralde
 */
public class PanelDegradado extends JPanel {

    private Color colorPrimario = Color.BLACK;
    private Color colorSecundario = Color.LIGHT_GRAY;
    private Color colorContorno = new Color(0x262d3d);

    public PanelDegradado() {
        super();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);


        Paint oldPaint = g2.getPaint();
        RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(
                0, 0, getWidth(), getHeight() - 1, 0, 0);
        g2.clip(r2d);
        g2.setPaint(new GradientPaint(0.0f, 0.0f, getColorPrimario().darker(),
                0.0f, getHeight(), getColorSecundario().darker()));
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setStroke(new BasicStroke(4f));
        g2.setPaint(new GradientPaint(0.0f, 0.0f, getColorContorno(),
                0.0f, getHeight(), getColorContorno()));
        g2.drawRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 2, 2);

        g2.setPaint(oldPaint);
        super.paintComponent(g);
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Color getColorContorno() {
        return colorContorno;
    }

    public void setColorContorno(Color colorContorno) {
        this.colorContorno = colorContorno;
    }

}