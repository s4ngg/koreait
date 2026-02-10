package kr.co.studyProject.MemberService;

import kr.co.studyProject.dto.ReqLoginDTO;
import kr.co.studyProject.dto.ReqRegisterDTO;
import kr.co.studyProject.dto.ResLoginDTO;

public interface MemberService {
	void register(ReqRegisterDTO request);
	
	ResLoginDTO login(ReqLoginDTO request);
}
