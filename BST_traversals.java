/** Iteratively traverses the binary tree in pre-order */
public void preorder( ) {
    if( root == null ) return;

    Stack<Node> stack = new Stack<Node>( );
    stack.push( root );

    while( ! stack.isEmpty( ) ) {
        Node current = stack.pop( );
        if( current.right != null ) stack.push( current.right );
        if( current.left != null ) stack.push( current.left );
        System.out.print( current.data + " " );
    }
}

/** Iteratively traverses the binary tree in in-order */
public void inorder( ) {
    Node node = root;
    Stack<Node> stack = new Stack<Node>( );
    while( ! stack.isEmpty( ) || node != null ) {
        if( node != null ) {
            stack.push( node );
            node = node.left;
        } else {
            node = stack.pop( );
            System.out.print( node.data + " " );
            node = node.right;
        }
    }
}

/** Iteratively traverses the binary tree in post-order */
public void postorder( ) {
    if( root == null ) return;

    Stack<Node> stack = new Stack<Node>( );
    Node current = root;

    while( true ) {

        if( current != null ) {
            if( current.right != null ) stack.push( current.right );
            stack.push( current );
            current = current.left;
            continue;
        }

        if( stack.isEmpty( ) ) return;
        current = stack.pop( );

        if( current.right != null && ! stack.isEmpty( ) && current.right == stack.peek( ) ) {
            stack.pop( );
            stack.push( current );
            current = current.right;
        } else {
            System.out.print( current.data + " " );
            current = null;
        }
    }
}

/** Traverses the tree in a pre-order approach, starting from the specified node. */
public void preorder( Node node ) {
    if( node != null ) {
        System.out.print( node.data + " " );
        preorder( node.left );
        preorder( node.right );            
    }
}

/** Traverses the tree in a in-order approach, starting from the specified node. */
private void inorder( Node node ) {
    if( node != null ) {
        inorder( node.left );
        System.out.print( node.data + " " );
        inorder( node.right );
    }
}

/** Traverses the tree in a post-order approach, starting from the specified node. */     
public void postorder( Node node ) {
    if( node != null ) {
        postorder( node.left );
        postorder( node.right );
        System.out.print( node.data + " " );
    }
}