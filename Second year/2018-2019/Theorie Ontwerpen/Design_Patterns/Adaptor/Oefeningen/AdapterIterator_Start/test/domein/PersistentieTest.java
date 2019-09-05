package domein;

import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import persistentie.PersistentieBeheerder;

public class PersistentieTest {

    @Test
    public void lezenBestand() {
        DefaultMutableTreeNode root
                = PersistentieBeheerder.getInstance().geefMenus();
        Assert.assertNotNull(root);

        Enumeration<TreeNode> enumeration
                = root.children();

        Iterator<TreeNode> it
                = new EnumerationIterator<>(enumeration);

        Assert.assertEquals(3, root.getChildCount());

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) it.next();

        Assert.assertEquals("Bestand", ((MenuActie) node.getUserObject()).getOmschrijving().trim());
        Enumeration<TreeNode> kinderen = node.children();

        Iterator<TreeNode> itKinderen
                = new EnumerationIterator<>(kinderen);

        Assert.assertEquals(3, node.getChildCount());
        DefaultMutableTreeNode nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Opslaan", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Opslaan als", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Afsluiten", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());

        node = (DefaultMutableTreeNode) it.next();
        Assert.assertEquals("Bewerken", ((MenuActie) node.getUserObject()).getOmschrijving().trim());

        kinderen = node.children();

        itKinderen
                = new EnumerationIterator<>(kinderen);

        Assert.assertEquals(2, node.getChildCount());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Ongedaan maken", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Plakken", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        kinderen = nodeKind.children();

        itKinderen
                = new EnumerationIterator<>(kinderen);

        Assert.assertEquals(2, nodeKind.getChildCount());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Plakken normaal", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Plakken speciaal", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());

        node = (DefaultMutableTreeNode) it.next();
        Assert.assertEquals("Help", ((MenuActie) node.getUserObject()).getOmschrijving().trim());
        kinderen = node.children();

        itKinderen = new EnumerationIterator<>(kinderen);
        Assert.assertEquals(1, node.getChildCount());
        nodeKind = (DefaultMutableTreeNode) itKinderen.next();
        Assert.assertEquals("Info", ((MenuActie) nodeKind.getUserObject()).getOmschrijving().trim());
    }
}
