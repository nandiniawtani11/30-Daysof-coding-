public Stack<Character>stack=new Stack<>();
     public  Queue<Character> q=new LinkedList<Character>();
    public void pushCharacter(char c)
    {
        stack.push(c);
    }
    public void enqueueCharacter(char c)
    {   
        q.add(c);
    }
    public char popCharacter()
    {
        return stack.pop();
    }
    public char dequeueCharacter()
    {
        return q.remove();
    }
