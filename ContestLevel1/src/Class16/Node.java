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
public class Node {

    int score;
    int rank;
    Node left, right;

    public Node (int s)
    {
	score = s;
	rank = 0;
	left = null;
	right = null;
    }
    
}
