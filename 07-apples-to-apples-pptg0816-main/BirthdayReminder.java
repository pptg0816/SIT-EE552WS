public class BirthdayReminder implements Comparable<BirthdayReminder> {
  int month;
  int day;

  public BirthdayReminder(int month, int day) {
    this.month = month;
    this.day = day;
  }


  @Override
  public int compareTo(BirthdayReminder o) {
    // TODO implement this method
    if (this.month > o.month){
      return this.month - o.month;
    }

    else if(this.month == o.month) {
      if (this.day != o.day) {
        return this.day - o.day;
      }
      else {
        return 0;
      }
    }

    else{
      return o.month - this.month;
    }

  }
}

