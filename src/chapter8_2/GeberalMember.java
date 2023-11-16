package chapter8_2;

public class GeberalMember {

        private long id;
        private String name;
        private Lesson lesson;

        public GeberalMember(long id, String name, Lesson lesson) {
            this.id = id;
            this.name = name;
            this.lesson = lesson;
        }

        public int membershipFee() {
            return 1000;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public int fee() {
        return lesson.fee();
    }

    public String getLessonId() {
        return lesson.getLessonId();
    }

    public String getLessonName() {
        return lesson.getLessonName();
    }
}
