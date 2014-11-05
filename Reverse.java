class Reverse {
  public static void main(String[] args) {
    String toReverse = "The fat man jumped over a cow";
    System.out.println(toReverse);
    char[] charArray = toReverse.toCharArray();
    int start = 0;
    int end = toReverse.length() - 1;
    String reversed = reverse_word_order(toReverse);
    System.out.println(reversed);
    String a = "matt";
    char[] mychar = a.toCharArray();
    reverse_string(mychar, 0, 2);
    String ab = new String(mychar);
    System.out.println(ab);
  }

  public static void reverse_string(char[] charArray, int start, int end)
  {
    char temp;
    while (start < end)
    {
      temp = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = temp;
      start = start + 1;
      end = end - 1;
    }
  }

  public static Boolean is_letter(char my_char)
  {
    if (my_char >= 'a' && my_char <= 'z')
    {
      return true;
    }

    if (my_char >= 'A' && my_char <= 'Z')
    {
      return true;
    }

    if (my_char == '\'')
    {
      return true;
    }

    return false;
  }

  public static String reverse_word_order(String toReverse)
  {
    // reverse the whole string. the letters in the words will be backwards
    char[] myCharArray = toReverse.toCharArray();
    reverse_string(myCharArray, 0, toReverse.length() - 1);

    boolean in_word = false;
    int word_began = -1;
    boolean char_is_letter = false;
    for (int i = 0; i < toReverse.length(); i++)
    {
      char_is_letter = is_letter(myCharArray[i]);
      if (in_word)
      {
        if (!char_is_letter)
        {
          in_word = false;
          reverse_string(myCharArray, word_began, i - 1);
        }
      }
      else
      {
        if (char_is_letter)
        {
          in_word = true;
          word_began = i;
        }
      }
    }
    if (in_word)
    {
      reverse_string(myCharArray, word_began, toReverse.length() - 1);
    }
    String reversed = new String(myCharArray);
    return reversed;
  }
}