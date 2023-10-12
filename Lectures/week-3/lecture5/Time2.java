//Time2 class declaration with overloaded constructors

public class Time2 {
    private int hour; //0-23
    private int minute; //0-59
    private int second; //0-59

    //Time2 constructor with no arguments
    //initialises each instance variable to zero
    public Time2() {
        this(0,0,0); //invoke contructor with three arguments
    }

    //Time2 constructor: hour is supplied, minute and second default to 0
    public Time2(int hour) {
        this(hour,0,0); //invoke contructor with three arguments
    }

    //Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int hour, int minute) {
        this(hour,minute,0); //invoke contructor with three arguments
    }

    //Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be 1-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be 1-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Second must be 1-59");
        }

        this.hour = hour
        this.minute = minute
        this.second = second

        //Time2 constructor: another Time2 object supplied
        public Time2(Time2 time) {
            //invoke constructor with three arguments
            this(time.hour, time.minute, time.second);
        }

        //Set methods
        //set a new time value using universal time
        //validate the data 
        public void setTime(int hour, int minute, int second) {
            if (hour < 0 || hour >= 24) {
                throw new IllegalArgumentException("Hour must be 1-23");
            }

            if (minute < 0 || minute >= 60) {
                throw new IllegalArgumentException("Minute must be 1-59");
            }

            if (second < 0 || second >= 60) {
                throw new IllegalArgumentException("Second must be 1-59");
            }

            this.hour = hour
            this.minute = minute
            this.second = second
        }

        //validate and set hour
        public void setHour(int hour) {
            if (hour < 0 || hour >= 24) {
                throw new IllegalArgumentException("Hour must be 0-23");
            }

            this.hour = hour;
        }

        //validate and set minute
        public void setMinute(int minute) {
            if (minute < 0 || minute >= 60) {
                throw new IllegalArgumentException("Minute must be 0-59");
            }

            this.minute = minute;
        }

        //validate and set second
        public void setSecond(int second) {
            if (second < 0 || second >= 60) {
                throw new IllegalArgumentException("Second must be 0-59");
            }

            this.second = second;
        }

        //get methods
        public int getHour() {return hour;}

        public int getMinute() {return minute;}

        public int getSecond() {return second;}

        //convert to string in universal-time format (HH:MM:SS)
        public String toUniversalString() {
            return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond()
            );
        }

        //convert to string in standard-time format (H:MM:SS AM or PM)
        public String toString() {
            return String.format(
                "%d:%02d:%02d %s", 
                //if hour is 0 or 12, display as 12, otherwise display as hour % 12 (change 24hr time to 12hr)
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                //if hour is < 12 display AM otherwise display PM
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
        }
    }
}