/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kpsomani2
 */
class Node
{
    Node left,right;
    char val;
    Node(char d)
    {
       val=d;
       left=null;
       right=null;
    }
}
public class BinaryTre {
    Node root;
    BinaryTre()
    {
        root=null;
    }
    
    void printBinaryTree()
    {
        int h=this.height(root);
        
        for(int i=0;i<=h;i++)
        {
            givenBinaryTree(root,i);

        }
    }
    int height(Node root)
    {
        if(root==null)
        {
           return 1; 
        }
        else {
            int lheight=height(root.left);
            int rheight=height(root.right);
            
            
                   if(lheight >= rheight)
                     {
                          return (lheight+1);
                        }
                   else 
                       return(rheight+1);
            }
        
        
    }
     void givenBinaryTree(Node root, int i)
     {
         if(root==null)
         {
           return;  
         }
         if(i==1)
         {
             System.out.print(root.val +" ");
         }
         else if(i>1)
         {    
             givenBinaryTree(root.left,i-1);
             givenBinaryTree(root.right,i-1);
         }
         
     }
     void preOrder(Node root)
     {
         if(root==null)
         {
            return; 
         }
       System.out.println(root.val);   
       this.preOrder(root.left);
       this.preOrder(root.right);
     }
     
     void postOrder(Node root)
     {
          if(root==null)
         {
            return; 
         }
       this.preOrder(root.left);
       this.preOrder(root.right);
       System.out.println(root.val); 
     }
    public static void main(String args[])
    {
        BinaryTre obj=new BinaryTre();
        obj.root=new Node('2');
        obj.root.left=new Node('3');
        obj.root.right=new Node('5');
        obj.root.left.left=new Node('7');
        obj.root.right.left=new Node('9');
        obj.root.right.right=new Node('1');
        
        System.out.println("Level order traversal of binary tree is ");
        obj.printBinaryTree();
        
    }
}
