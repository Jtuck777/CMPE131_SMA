package CMPE140.TESTPREP;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.repository.CrudRepository;

@Entity
@Table(name="QuestionList")
public class Question  implements Serializable  {
    @Id
    @Column(name = "QUEST_NUM", unique = true) private int Q_num;
    @Column(name="QUEST", unique = true) private String Q;
    @Column(name="OPT_A", unique = true) private String OptA;
    @Column(name="OPT_B", unique = true) private String OptB;
    @Column(name="OPT_C", unique = true) private String OptC;
    @Column(name="OPT_D", unique = true) private String OptD;
    @Column(name="ANS", unique = true) private String ANSWER;

    public Question() {
    }

    public Question(String Q, String OptA, String OptB,
                    String OptC, String OptD, String ANS){
        setQ(Q);
        setOptA(OptA); setOptB(OptB);
        setOptC(OptC); setOptD(OptD);
        setANSWER(ANS);
    }

    public String getQ (){ return Q;}
    public void setQ(String Q){this.Q =Q;}
    public String getOptA (){ return OptA;}
    public void setOptA(String OptA){this.OptA=OptA;}
    public String getOptB (){ return OptB;}
    public void setOptB(String OptB){this.OptB=OptB;}
    public String getOptC (){ return OptC;}
    public void setOptC(String OptC){this.OptC=OptC;}
    public String getOptD (){ return OptD;}
    public void setOptD(String OptD){this.OptD=OptD;}
    public String getANSWER (){ return ANSWER;}
    public void setANSWER(String ANSWER){this.ANSWER=ANSWER;}

}
