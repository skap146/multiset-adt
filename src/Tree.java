public class Tree extends Object {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    public Tree(int root, Tree[]subtrees){//TODO
        int treeRoot = root;
        Tree[] treeSub = subtrees;

    }

    public Tree(Tree[]subtrees){//TODO
        Tree[] treeSub = subtrees;

    }

    public Tree(int root){//TODO
        int treeRoot = root;

    }
    public Tree(){//TODO

    }

    public boolean isEmpty(){//TODO
        return true;
    }

    public int getSize(){//TODO
        return 0;
    }

    @Override
    public String toString() {//TODO
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {//TODO
        return super.equals(obj);
    }

    public int count(){//TODO
        return 0;
    }

    private String str_indented() {//TODO
        return "";
    }

    public double average(){//TODO
        return 0;
    }

    private int[] average_helper(){//TODO
        return new int[2];
    }

    public boolean contains(){//TODO
        return true;
    }

    public int[] leaves(){//TODO
        return new int[9];
    }

    public boolean delete_item(){//TODO
        return true;
    }

    private void delete_root(){//TODO

    }

    public boolean insert_child(){//TODO
        return true;
    }

    public void insert(){//TODO
    }

    private int extract_leaf(){//TODO
        return 0;
    }

}
