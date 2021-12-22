package edabit;

public class UpvotesVsDownvotes {

    public static final int UPVOTES = 2;
    public static final int DOWNVOTES = 33;

    public static int getVoteCount(int upvotes, int downvotes) {
        return upvotes - downvotes;
    }

    public static void main(String[] args) {
        //UpvotesVsDownvotes upvotesvsdownvotes = new UpvotesVsDownvotes();
        //System.out.println(upvotesvsdownvotes.getVoteCount(UPVOTES, DOWNVOTES));

        System.out.println(getVoteCount(UPVOTES, DOWNVOTES));
    }
}
