package api.ui;

import api.business.PostBusiness;
import api.entity.PostEntity;

import javax.swing.*;
import java.awt.*;

public class PostDetailForm extends JFrame {

    private JPanel rootPanel;
    private JLabel lblTitulo;
    private JLabel lblBody;

    private PostBusiness mPostBusiness = new PostBusiness();

    PostDetailForm(int id) {
        super();

        this.loadPost(id);
        this.setContentPane(rootPanel);
        this.setSize(500, 250);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        this.setVisible(true);
    }

    private void loadPost(int id) {
        PostEntity entity = this.mPostBusiness.getSinglePost(id);

        this.lblTitulo.setText(entity.getTitle());
        this.lblBody.setText("<html>" + entity.getBody() + "</html>");
    }
}