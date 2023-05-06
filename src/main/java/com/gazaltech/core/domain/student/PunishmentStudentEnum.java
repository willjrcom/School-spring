package com.gazaltech.core.domain.student;

import lombok.Getter;

@Getter
public enum PunishmentStudentEnum {
	SUSPENSION_FOR_ABSENCE(2, 1),
	SUSPENSION_FOR_DISRESPECT(4, 1),
	SUSPENSION_FOR_BAD_MANNERS(6, 2),
	SUSPENSION_FOR_FIGHT(8, 4);
	
	private final int severity;
	private final int suspensionDays;

	private PunishmentStudentEnum(int severity, int suspensionDays) {
		this.severity = severity;
		this.suspensionDays = suspensionDays;
	}
}
