package Exam18-19;

public class 3c{

    public double computeAverageAge(List<ClubMember>members){
        
        int total=0;
        for(ClubMember member:members){
            total+=member.getAge();
        }
        return (double)total/members.size();
    }

    public List<ClubMember> oldMembers(List<ClubMember>members){
        ArrayList<ClubMember> oldMembers = new ArrayList<>();
        for (ClubMember member:members){
            if(member.getAge()>60){
                oldMembers.add(member);
            }
        }
        return oldMembers;
    }
    
}
