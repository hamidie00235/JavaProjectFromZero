package EnumProjects;

public enum DayOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean isWeekend;

    // Constructor
    DayOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // Method to get activity
    public String getActivity() {
        if (isWeekend) {
            return "Relax and enjoy!";
        } else {
            return "Work day";
        }
    }

        public static void main(String[] args) {
            for (DayOfWeek day : DayOfWeek.values()) {
                System.out.println(day + " -> " + day.getActivity());
            }
        }
    }
