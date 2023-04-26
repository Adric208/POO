package Tarea12.iu;

import java.awt.*;

public class Principal extends Frame {
    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBoton1;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        lblNombre = new Label("");
        this.add(lblNombre);

        this.setVisible(true);
    }
}
