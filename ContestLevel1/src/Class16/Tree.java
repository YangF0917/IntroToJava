/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class16;

/**
 *
 * @author nanth
 */
public class Tree {
    Node root;

    public Tree ()
    {
	root = null;
    }


    public int add (int s)
    {
	int rank = 0;
	if (root == null)
	    root = new Node (s);
	else
	{
	    Node n = root;
	    while (true)  // not infinite: it will insert and exits
		if (s < n.score)
		{
		    rank += n.rank + 1;
		    if (n.left == null)
		    {
			n.left = new Node (s);
			return rank;
		    }
		    else
			n = n.left;
		}
		else
		{
		    n.rank++;
		    if (n.right == null)
		    {
			n.right = new Node (s);
			return rank;
		    }
		    else
			n = n.right;
		}
	}
	return rank; // it never gets here, but Java doesn't know that :-)
    }
}
